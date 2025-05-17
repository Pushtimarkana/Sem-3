const http=require('http');
const fs=require('fs');

const server=http.createServer((req,res)=>{

    if(req.url=='/favicon.ico'){
        res.end("favicon icon");
    }
    else if(req.url=='/home'){
        fs.readFile('Web_Home.html',(err,data)=>{
            if(err){
                throw err;
            }
            else{
                res.end(data);
            }
        })
        //res.end("welcome home");
    }
    else if(req.url=='/about'){
        fs.readFile('Web_About.html',(err,data)=>{
            if(err){
                throw err;
            }
            else{
                res.end(data);
            }
        })
        //res.end('this is my about page');
    }
    else if(req.url=='/contact'){
        fs.readFile('Web_Contact.html',(err,data)=>{
            if(err){
                throw err;
            }
            else{
                res.end(data);
            }
        })
        //res.end('this is my about page');
    }
    else if(req.url=='/help'){
        fs.readFile('Web_Help.html',(err,data)=>{
            if(err){
                throw err;
            }
            else{
                res.end(data);
            }
        })
        //res.end('this is my about page');
    }
    else{
        fs.readFile('Web_Main.html',(err,data)=>{
            if(err){
                throw err;
            }
            else{
                res.end(data);
            }
        })
        //res.end('hello from main:');
    }
});
server.listen(3002,()=>{
    console.log("server is in listen mode.");
}); 
