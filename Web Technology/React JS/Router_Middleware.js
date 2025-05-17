const express=require('express');
const Students_Routers=require('./Students_Routers');

const app=express();

app.use('/student',Students_Routers);

const port=3000;
app.listen(port,()=>{
    console.log("Server Started @",port);
})