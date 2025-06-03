import tensorflow as tf
import numpy as np
import matplotlib.pyplot as plt
import cv2
import os
from tensorflow.keras.preprocessing.image import ImageDataGenerator
from tensorflow.keras.datasets import cifar10

# Load dataset (CIFAR-10 có class "cat" và "dog")
(X_train, y_train), (X_test, y_test) = cifar10.load_data()

# Lọc chỉ lấy hình ảnh của mèo (label=3) và chó (label=5)
mask_train = (y_train == 3) | (y_train == 5)
mask_test = (y_test == 3) | (y_test == 5)

X_train, y_train = X_train[mask_train.squeeze()], y_train[mask_train.squeeze()]
X_test, y_test = X_test[mask_test.squeeze()], y_test[mask_test.squeeze()]

# Chuyển nhãn thành 0 (mèo) và 1 (chó)
y_train = (y_train == 5).astype(int)
y_test = (y_test == 5).astype(int)

# Chuẩn hóa ảnh về 0-1
X_train, X_test = X_train / 255.0, X_test / 255.0
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Conv2D, MaxPooling2D, Flatten, Dense, Dropout

# Xây dựng model CNN
model = Sequential([
    Conv2D(32, (3,3), activation='relu', input_shape=(32, 32, 3)),
    MaxPooling2D(2,2),

    Conv2D(64, (3,3), activation='relu'),
    MaxPooling2D(2,2),

    Flatten(),
    Dense(128, activation='relu'),
    Dropout(0.5),
    Dense(1, activation='sigmoid')  # Dự đoán binary (mèo = 0, chó = 1)
])

# Compile model
model.compile(optimizer='adam', loss='binary_crossentropy', metrics=['accuracy'])
model.summary()
history = model.fit(X_train, y_train, epochs=10, validation_data=(X_test, y_test))
# Vẽ biểu đồ Accuracy và Loss
plt.figure(figsize=(12, 5))

plt.subplot(1, 2, 1)
plt.plot(history.history['accuracy'], label='Train Accuracy')
plt.plot(history.history['val_accuracy'], label='Test Accuracy')
plt.legend()
plt.title('Accuracy')

plt.subplot(1, 2, 2)
plt.plot(history.history['loss'], label='Train Loss')
plt.plot(history.history['val_loss'], label='Test Loss')
plt.legend()
plt.title('Loss')

plt.show()
# Lấy một hình ảnh bất kỳ từ tập test
index = np.random.randint(0, len(X_test))
image = X_test[index]

# Dự đoán
prediction = model.predict(np.expand_dims(image, axis=0))[0][0]

# Hiển thị hình ảnh và dự đoán
plt.imshow(image)
plt.title(f"Dự đoán: {'Chó 🐶' if prediction > 0.5 else 'Mèo 🐱'}")
plt.axis("off")
plt.show()
