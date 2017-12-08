import React from 'react'
import axios from 'axios';
import Cookies from 'js-cookie' ;

axios.defaults.baseURL = 'http://localhost:8080';

// export default () => (
//   <div className='container'>
//     <div className='login-form'>
//         <h4>Dashboard page</h4>
//     </div>
//     <style jsx>{`
//       .container{
//         width: 50%;
//         margin: 0 auto;
//
//       }
//
//       .login-form{
//         border: 0.5px solid gray;
//         margin: 0 auto;
//         padding: 30px 50px 30px 50px;
//       }
//     `}</style>
//   </div>
// )

export default class extends React.Component{

  constructor (props) {
    super(props);

    this.state = {
      user: {},
      sessionKey: '',
      csrftoken: ''
    };
  }

  componentDidMount() {
    this._getSessionKey();
    // this._fetchUser();
  }

  render() {
    return (
        <div className='container'>
          <div className='login-form'>
              <h4>Dashboard page</h4>
              <h4>{this.state.sessionKey}</h4>
              <h4>{this.state.csrftoken}</h4>
          </div>
          <style jsx>{`
            .container{
              width: 50%;
              margin: 0 auto;

            }

            .login-form{
              border: 0.5px solid gray;
              margin: 0 auto;
              padding: 30px 50px 30px 50px;
            }
          `}</style>
        </div>

    )
  }

  _fetchUser() {
    axios.get("/api/users/")
      .then(res => {
        const courses = res.data._embedded.courses;
        this.setState({ courses });
      })
      .catch(function (error) {
        console.log(error);
      });

  }

  _getSessionKey() {
    // const key = document.cookie ;
    const key = Cookies.get("JSESSIONID");
    this.setState({ 'sessionKey': key });

    const csrf = Cookies.get("csrftoken");
    this.setState({ 'csrftoken': csrf });
  }

}
