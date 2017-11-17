import React from 'react';
// import Router from 'next/router';
import axios from 'axios';
import Button from 'material-ui/Button';
import CourseList from '../components/CourseList'

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
      <div className="wrapper">
          <h3>Homepage</h3>
          <Button>
            Log In
          </Button>
          <CourseList courses={this.state.courses} />

            <style jsx>{`
              .wrapper {
                background-color: #eeeeee;
              }
            `}</style>

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
