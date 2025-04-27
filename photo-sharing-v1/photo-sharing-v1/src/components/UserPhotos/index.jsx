import React from "react";
import { Typography, Grid, Card, CardContent, CardMedia } from "@mui/material";
import { useParams } from "react-router-dom";
import models from "../../modelData/models";
import "./styles.css";

function UserPhotos() {
  const { userId } = useParams(); // Get the userId from URL
  const photos = models.photoOfUserModel(userId); // Get the photos for the user

  return (
    <div>
      <Typography variant="h6" sx={{ marginBottom: 2 }}>
        Photos of {models.userModel(userId).first_name}{" "}
        {models.userModel(userId).last_name}
      </Typography>

      {/* Display the photos in a grid */}
      <Grid container spacing={2}>
        {photos && photos.length > 0 ? (
          photos.map((photo) => {
            const photoSrc = require(`../../images/${photo.file_name}`); // Dynamically load image

            return (
              <Grid item key={photo._id} xs={12} sm={6} md={4}>
                <Card>
                  <CardMedia
                    component="img"
                    height="200"
                    image={photoSrc} // Use dynamically imported image
                    alt={photo.file_name}
                  />
                  <CardContent>
                    <Typography variant="body2" color="textSecondary">
                      {new Date(photo.date_time).toLocaleString()}{" "}
                      {/* Format date */}
                    </Typography>
                    {/* Loop through comments */}
                    {photo.comments && photo.comments.length > 0 ? (
                      photo.comments.map((comment) => (
                        <Typography variant="body2" key={comment._id}>
                          <strong>
                            {comment.user.first_name} {comment.user.last_name}
                          </strong>
                          : {comment.comment}
                          <br />
                          <small>
                            {new Date(comment.date_time).toLocaleString()}
                          </small>
                        </Typography>
                      ))
                    ) : (
                      <Typography variant="body2" color="textSecondary">
                        No comments yet.
                      </Typography>
                    )}
                  </CardContent>
                </Card>
              </Grid>
            );
          })
        ) : (
          <Typography variant="body1" color="textSecondary">
            No photos available for this user.
          </Typography>
        )}
      </Grid>
    </div>
  );
}

export default UserPhotos;