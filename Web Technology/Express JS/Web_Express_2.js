const express=require('express');
const app=express();

app.get('/home',(req,res)=>{
    res.send("Hellow From Home");
});
app.get('/about',(req,res)=>{
    res.send("About us:")
});
app.get('/contact',(req,res)=>{
    res.send("Thank you for contact us:");
});
app.get('/help',(req,res)=>{
    res.send("Halp of any Query as following:");
});
app.get('/',(req,res)=>{
    res.send("Hellow World From Express ");
});

app.listen(3000,()=>{
    console.log("Server started @3000:");
})