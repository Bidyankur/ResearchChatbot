import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import ChatPage from './pages/ChatPage';
import UploadPage from './pages/UploadPage';


function App() {
return (
<Router>
<nav style={{ padding: '10px', background: '#eee' }}>
<Link to="/chat" style={{ marginRight: '10px' }}>Chat</Link>
<Link to="/upload">Upload</Link>
</nav>
<Routes>
<Route path="/chat" element={<ChatPage />} />
<Route path="/upload" element={<UploadPage />} />
</Routes>
</Router>
);
}


export default App;