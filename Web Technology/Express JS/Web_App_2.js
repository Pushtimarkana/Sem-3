const http=require('http');
const server=http.createServer((req,res)=>{
    res.end("hello server");
});
server.listen(3002,()=>{
    console.log("server is in listen mode.");
})  
if(req.url=='/favicon.ico'){
    res.end("favicon icon");
}
else if(req.url=='/home'){
    res.end("welcome home");
}
else if(erq.url=='/about'){
    res.end('this is my about page');
}