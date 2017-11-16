import React from 'react';
import Router from 'next/router';
import axios from 'axios';

// axios.create({
//   baseURL: 'http://localhost:8080',
//   timeout: 1000
// });
// axios.defaults.baseURL = 'http://localhost:8080';

export default class extends React.Component{

  constructor (props) {
    super(props);

    this.state = {
      courses: []
    };
  }

  componentDidMount() {
    // this._fetchComments();
  }

  render() {
    const { url, photos } = this.props
    return (
      <div>

          this.state.courses

      </div>
    )
  }

  _fetchComments() {
    // axios.get("/api/courses/")
    //   .then(res => {
    //     const courses = res.data._embedded.courses;
    //     this.setState({ courses });
    //   })
    //   .catch(function (error) {
    //     console.log(error);
    //   });

  }

}
