import React from 'react';
// import Router from 'next/router';
import axios from 'axios';
import Button from 'material-ui/Button';

axios.defaults.baseURL = 'http://localhost:8080';

export default class extends React.Component{

  constructor (props) {
    super(props);

    this.state = {
      courses: [],
      firstCourseName: ""
    };
  }

  componentDidMount() {
    this._fetchCourses();
  }

  render() {
    return (
      <div>
          <h3>Homepage</h3>
            <Button>
              Hello World
            </Button>

      </div>
    )
  }

  _fetchCourses() {
    axios.get("/api/courses/")
      .then(res => {
        const courses = res.data._embedded.courses;
        this.setState({ courses });
      })
      .catch(function (error) {
        console.log(error);
      });

  }

}
