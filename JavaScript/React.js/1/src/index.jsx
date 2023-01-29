import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';

const root = ReactDOM.createRoot(document.getElementById('root'))
root.render(
    <div>
        <img src="logo.png" alt='react-logo' height="20px"/>
        <h1>Fun facts about React</h1>
        <ul id='list'>
            <li>Was released in 2013</li>
            <li>Was originally created by Jordan Walke</li>
            <li>Has well over 100K stars on Github</li>
            <li>Is maintained by Facebook</li>
            <li>Powers thousands of enterprise apps, including mobile apps</li>
        </ul>
    </div>
)
