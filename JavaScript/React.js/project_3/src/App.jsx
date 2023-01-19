import React, { useState } from 'react';
import './App.css';

function App() {
  const quoteList = [
    "If you're good at something, never do it for free.",
    "I'm not afraid of the man who practices 1000 kicks 1 time, but rather of the man who practices 1 kick 1000 times.",
    'Talk is cheap, show me the code.',
    'Another random quote'
  ]
  const [quote,setQuote] = useState('Click the button!')

  function randomiseQuote() {
    setQuote(quoteList[Math.floor(Math.random() * quoteList.length)])
  }
  return (
    <div>
      <h1>{quote}</h1>
      <br />
      <button onClick={randomiseQuote}>Click Me!</button>
    </div>
  );
}

export default App;
