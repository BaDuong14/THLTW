import pandas as pd
import matplotlib.pyplot as plt

# Tạo DataFrame
data = {
    "Country": ["USA", "Canada", "Germany", "UK", "France"],
    "Capital": ["Washington D.C.", "Ottawa", "Berlin", "London", "Paris"],
    "Population": [331002651, 37742154, 83783942, 67886011, 65273511],
    "Area": [9833520, 9984670, 357022, 243610, 551695]
}
df = pd.DataFrame(data)

# 6.1. Đọc 3 dòng đầu tiên
print(df.head(3))

# 6.2. Tạo cột Density
df['Density'] = df['Population'] / df['Area']

# 6.3. Lấy các dòng có Population lớn hơn 50 triệu
df_large_pop = df[df['Population'] > 50000000]
print(df_large_pop)

# 6.4. Tính trung bình, độ lệch chuẩn của cột Density
mean_density = df['Density'].mean()
std_density = df['Density'].std()
print("Trung bình mật độ dân số:", mean_density)
print("Độ lệch chuẩn mật độ dân số:", std_density)

# 6.5. Vẽ biểu đồ cột (bar plot) thể hiện dân số của các quốc gia
plt.bar(df['Country'], df['Population'])
plt.xlabel('Quốc gia')
plt.ylabel('Dân số')
plt.title('Biểu đồ dân số các quốc gia')
plt.show()

# 6.6. Vẽ biểu đồ tròn (pie chart) thể hiện tỷ lệ diện tích của các quốc gia
plt.pie(df['Area'], labels=df['Country'], autopct='%1.1f%%')
plt.title('Tỷ lệ diện tích các quốc gia')
plt.show()

# 6.7. Hàm trả về dân số của quốc gia
def get_population(country):
    return df[df['Country'] == country]['Population'].values[0]

print(get_population('USA'))

# 6.8. Lưu và đọc lại DataFrame
df.to_csv('countries.csv', index=False)
df_new = pd.read_csv('countries.csv')
print(df_new)