import React, { useState } from 'react';
import Select from 'react-select';
import '../css/createPost.css';

  const options = [
    { value: 'technology', label: 'Technology' },
    { value: 'health', label: 'Health' },
    { value: 'science', label: 'Science' },
    { value: 'travel', label: 'Travel' },
    { value: 'finance', label: 'Finance' }

    //TODO: getting tags from DB
  ];
  
  const CreatePost = () => {
    const [title, setTitle] = useState('');
    const [content, setContent] = useState('');
    const [selectedTags, setSelectedTags] = useState([]);
  
    const handleSubmit = (e) => {
      e.preventDefault();
      const postData = {
        title,
        content,
        tags: selectedTags.map(tag => tag.value)
      };
      // Handle form submission, e.g., send data to server or update state
      console.log('Post Data:', postData);
    };
  
    return (
      <div>
        <h1>Create a New Blog Post</h1>
        <form onSubmit={handleSubmit}>
          <div>
            <label htmlFor="title">Title:</label>
            <input
              type="text"
              id="title"
              value={title}
              onChange={(e) => setTitle(e.target.value)}
            />
          </div>
          <div>
            <label htmlFor="content">Content:</label>
            <textarea
              id="content"
              value={content}
              onChange={(e) => setContent(e.target.value)}
            ></textarea>
          </div>
          <div>
            <label htmlFor="tags">Tags:</label>
            <Select
              id="tags"
              isMulti
              options={options}
              value={selectedTags}
              onChange={setSelectedTags}
            />
          </div>
          <button type="submit">Submit</button>
        </form>
      </div>
    );
  };

export default CreatePost;