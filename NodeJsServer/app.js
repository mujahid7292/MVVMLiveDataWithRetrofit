// Start app "nodemon app" in command line

const express = require('express');
const router = require('./router/api')

//Fire Up Express
const app = express();

//Middleware: router
app.use('/api',router);

app.get('/',(req,res)=>{
    res.send('Hello World');
});


app.listen(3000, ()=>{
    console.log('Listenning to port 3000')
});

