import React, { useState } from 'react';
import './App.css';

function App()
{
  const [ task, setTask ] = useState("")
  const [ todos, setToDo ] = useState([])
  function createToDo() {
    setToDo( oldToDo => {
      return [...oldToDo,task]
    })
  }
  
  return (
    <div>

      <input type="text" value={task} onChange={ event => {
        setTask(event.target.value)}}></input>
      <button type="submit" onClick={createToDo}>Submit!</button>
      <ul>
        {todos.map( todo => {
          return <li>{todo}</li>
        })}

        </ul>
    </div >
  );
}

export default App;
