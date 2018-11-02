const express = require('express');
const router = express.Router();

router.get('/ticket',(req,res)=>{
    res.send({
        Ticket_ID:"123",
        Ticket_Name: "Grand Stand",
        Ticket_Description:"Get In Stadium Fast"
    });
    
});

router.post('/ticket',(req,res)=>{
    res.send({Type:"POST"});
});

router.put('/ticket',(req,res)=>{
    res.send({Type:"PUT"});
});

router.delete('/ticket',(req,res)=>{
    res.send({Type:"DELETE"});
});

module.exports = router;