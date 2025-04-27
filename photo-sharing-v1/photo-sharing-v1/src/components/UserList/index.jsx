import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import models from '../../modelData/models'; // Import model data

function UserList() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    setUsers(models.userListModel()); // Load tất cả users khi component được mount
  }, []);

  return (
    <div>
      <h2>Danh sách người dùng</h2>
      <ul>
        {users.map((user) => (
          <li key={user._id}>
            <Link to={`/users/${user._id}`}>
              {user.first_name} {user.last_name}
            </Link>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default UserList;
