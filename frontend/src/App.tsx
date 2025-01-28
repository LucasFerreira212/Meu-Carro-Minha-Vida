import { useState, useEffect } from 'react';
import axios from 'axios';

function App() {
   const [message, setMessage] = useState('');

   useEffect(() => {
      axios.get('http://localhost:8080/api/message')
         .then(response => {
            setMessage(response.data);
         })
         .catch(error => {
            console.error('Ocorreu um erro!', error);
         });
   }, []);

   return (
      <div>
         <h1>{message}</h1>
      </div>
   );
}

export default App;
