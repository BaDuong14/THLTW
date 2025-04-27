import React from 'react';
import { AppBar, Toolbar, Typography } from '@mui/material';
import { useLocation, useParams } from 'react-router-dom';
import models from '../../modelData/models';

function TopBar() {
  const location = useLocation();
  const { userId } = useParams();

  let contextInfo = "";

  if (location.pathname.startsWith('/users/') && !location.pathname.startsWith('/users') && userId) {
    const user = models.userModel(userId);
    if (user) {
      contextInfo = `${user.first_name} ${user.last_name}`;
    }
  } else if (location.pathname.startsWith('/photos/') && userId) {
    const user = models.userModel(userId);
    if (user) {
      contextInfo = `Photos of ${user.first_name} ${user.last_name}`;
    }
  } else if (location.pathname.startsWith('/users')) {
    contextInfo = "User List";
  }

  return (
    <AppBar position="absolute" style={{ backgroundColor: '#1976d2' }}>
      <Toolbar>
        <Typography variant="h6" style={{ flex: 1 }}>
          {/* Bên trái - Tên bạn */}
          Tên của bạn (ví dụ: Nguyễn Văn A)
        </Typography>
        <Typography variant="h6">
          {/* Bên phải - Context */}
          {contextInfo}
        </Typography>
      </Toolbar>
    </AppBar>
  );
}

export default TopBar;
