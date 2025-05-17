const express=require('express');

const app=express();
app.use('/phota',express.static('Image'));


app.listen(3000,()=>{
    console.log("Server Started @ 3000");
})