object Q1 extends App{

 val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

 val Encrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

 val Decrypt=(c:Char,key:Int,a:String)=>{

    if(a.indexOf(c.toUpper)-key<0){

       a((a.indexOf(c.toUpper)-key)%a.size+ a.size) 
    }
    else{

       a((a.indexOf(c.toUpper)-key)%a.size)

    }
 }

 val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

 val ct=cipher(Encrypt,"ab",5,alphabet)
 println(ct)

 val pt=cipher(Decrypt,"ct",5,alphabet)
 println(pt)
  
}
