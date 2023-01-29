import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import { Header } from './header';
import { Content } from './content';
import { Footer } from './footer';

const root = ReactDOM.createRoot(document.getElementById('root'))
root.render (  
    <div>
        <Header />
        <Content />
        <Footer />
    </div>
)