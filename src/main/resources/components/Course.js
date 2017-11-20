import React from 'react'

import Card, { CardActions, CardContent } from 'material-ui/Card';
import Button from 'material-ui/Button';
import Typography from 'material-ui/Typography';


export default class Course extends React.Component{
  render() {
    return (

          <Card>
            <CardContent>
              <Typography type="body1">
                Price: {this.props.course.price}
              </Typography>
              <Typography type="headline" component="h2">
                {this.props.course.coursename}
              </Typography>
              <Typography component="p">
                {this.props.course.description}
              </Typography>
            </CardContent>
            <CardActions>
              <Button dense>Learn More</Button>
            </CardActions>
          </Card>

    )
  }
}
