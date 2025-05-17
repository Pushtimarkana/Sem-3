const express=require('express');
const mongoose=require('mongoose');
const Students = require("./Students.js");
const Facultys=require('./Faculty_Schema.js');
const bodyParser = require('body-parser');

mongoose.connect('mongodb+srv://23010101160:Markana%40123@cluster0.wrsmv.mongodb.net/CSE_165')
.then(()=>{
    console.log("Mongoose Connected")
    const app=express();
    app.use(bodyParser.urlencoded());

    // get all in faculty
    app.get('/facultys',async(req,res)=>{
        const ans=await Facultys.find();
        res.send(ans);
    })

    //get by name in faculty
    app.get('/facultys/:name',async(req,res)=>{
        const ans=await Facultys.findOne({FirstName:req.params.name});
        res.send(ans);
    })

    //add faculty
    app.post('/facultys',async(req,res)=>{
        fact=new Facultys({ ...req.body});
        const ans=await fact.save();
        res.send(ans);
    });

    //get all in students
    app.get('/students',async(req,res)=>{
        const ans=await Students.find();
        res.send(ans);
    });

    //get by id 
    app.get('/students/:id',async(req,res)=>{
        const ans=await Students.findOne({Enroll:req.params.id});
        res.send(ans);
    });

    //add data
    app.post('/students',async(req,res)=>{
        stu=new Students({ ...req.body});
        const ans=await stu.save();
        res.send(ans);
    });

    //delete data
    app.delete('/students/:id',async(req,res)=>{
        const ans=await Students.deleteOne({Enroll:req.params.id});
        res.send(ans);
    });

    //edit data
    app.patch('/students/:id',async(req,res)=>{
        const stu=await Students.findOne({Enroll:req.params.id});
        stu.FirstName=req.body.FirstName;
        const ans=await stu.save();
        res.send(ans);
    })

    const port=3000;
    app.listen(port,()=>{
        console.log(`Server Started @ ${port}`);
    })

})
.catch((err)=>console.log("Errorr:",err));

