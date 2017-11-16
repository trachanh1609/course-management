import React from 'react'

export default ({ url: { query: { id } } }) => (
  <div className='container'>
    <div className='login-form'>
        <h4>Enter your username and password</h4>
        <input type='text' id='username' />
        <br/>
        <input type='password' id='password' />
    </div>
    <form action="/login" method="post">
        <div><label> User Name : <input type="text" name="username"/> </label></div>
        <div><label> Password: <input type="password" name="password"/> </label></div>
        <div><input type="submit" value="Sign In"/></div>
    </form>

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
