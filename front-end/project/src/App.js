import React from 'react';
import { BrowserRouter as Router, Routes,  Route, Link } from 'react-router-dom';
import Home from './pages/Home';
import Register from './pages/Register';
import NotFound from './pages/404';
import Error from './pages/500';
import Login from './pages/Login';
import CreatePost from './pages/createPost';
import UpdatePost from './pages/updatePost';

function App() {
  return (
    <Router>
      <div className="App">
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
          <div className="container">
            <Link className="navbar-brand" to="/">MyApp</Link>
            <div className="collapse navbar-collapse">
              <ul className="navbar-nav ml-auto">
                <li className="nav-item">
                  <Link className="nav-link" to="/">Home</Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to="/register">Register</Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to="/login">Login</Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to="/post/create">Create Post</Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to="/post/update">Update Post</Link>
                </li>
              </ul>
            </div>
          </div>
        </nav>
        <div className="container">
          <Routes>
            <Route path="/" element={<Home/>} />
            <Route path="/register" element={<Register/>} />
            <Route path="/login" element={<Login/>} />
            <Route path="/notFound" element={<NotFound/>} />
            <Route path="/error" element={<Error/>} />
            <Route path="/post/create" element={<CreatePost/>} />
            <Route path="/post/update" element={<UpdatePost/>} />
          </Routes>
        </div>
      </div>
    </Router>
  );
}

export default App;
