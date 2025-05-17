const express=require('express');

const roter=express();

roter.get('/first',(req,res)=>{
    res.send("First stu 1");
})

roter.get('/second',(req,res)=>{
    res.send("Second stu 2");
})

roter.get('/third',(req,res)=>{
    res.send("Third stu 3");
})

module.exports=roter;