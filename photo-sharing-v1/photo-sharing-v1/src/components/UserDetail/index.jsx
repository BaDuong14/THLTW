import React, { useEffect, useState } from 'react';
import { Link, useParams } from 'react-router-dom';
import models from '../../modelData/models';

function UserDetail() {
  const { userId } = useParams();
  const [user, setUser] = useState(null);

  useEffect(() => {
    setUser(models.userModel(userId));
  }, [userId]);

  if (!user) {
    return <div>Loading user...</div>;
  }

  return (
    <div>
      <h2>Thông tin người dùng</h2>
      <p><strong>Họ tên:</strong> {user.first_name} {user.last_name}</p>
      <p><strong>Địa điểm:</strong> {user.location}</p>
      <p><strong>Nghề nghiệp:</strong> {user.occupation}</p>
      <p><strong>Mô tả:</strong> {user.description}</p>

      <Link to={`/photos/${user._id}`}>Xem ảnh của {user.first_name}</Link>
    </div>
  );
}

export default UserDetail;
