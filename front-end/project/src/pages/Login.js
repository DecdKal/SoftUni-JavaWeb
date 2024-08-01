import React, { useState } from 'react';


const Login = () => {
    const [formData, setFormData] = useState({
      email: '',
      password: ''
    });
  
    const handleChange = (e) => {
      setFormData({
        ...formData,
        [e.target.name]: e.target.value
      });
    };
  
    const handleSubmit = (e) => {
      e.preventDefault();
      // Handle form submission, e.g., send data to an API
      console.log(formData);
    };
  
    return (
      <div className="container">
        <div className="row justify-content-center">
          <div className="col-md-6">
            <h2 className="my-4 text-center">Login</h2>
            <form onSubmit={handleSubmit}>
              <div className="form-group">
              </div>
              <div className="form-group">
                <label htmlFor="email">Email</label>
                <input
                  type="email"
                  className="form-control"
                  id="email"
                  name="email"
                  value={formData.email}
                  onChange={handleChange}
                  required
                />
              </div>
              <div className="form-group">
                <label htmlFor="password">Password</label>
                <input
                  type="password"
                  className="form-control"
                  id="password"
                  name="password"
                  value={formData.password}
                  onChange={handleChange}
                  required
                />
              </div>
              <button type="submit" className="btn btn-primary btn-block mt-3">
                Login
              </button>
            </form>
          </div>
        </div>
      </div>
    );
  };

  export default Login;