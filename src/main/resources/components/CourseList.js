import React from 'react'
import Course from './Course'
import Grid from 'material-ui/Grid';
import { GridList, GridListTile } from 'material-ui/GridList';

export default class CourseList extends React.Component{
  render() {
    const courses = this._getCourses();
    return (
      <div>
        <h3>Course List</h3>
        <GridList cellHeight={160} cols={3}>
          {courses}
        </GridList>
      </div>
    )
  }

  _getCourses() {
    return this.props.courses.map((course) => {
      return <GridListTile key={course.id}>
               <Course course={course}></Course>
             </GridListTile>
    });
  }
}
