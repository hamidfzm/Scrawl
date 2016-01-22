.class public Scrawlout 
.super java/lang/Object 
.method public <init>()V 
aload_0 
invokenonvirtual java/lang/Object/<init>()V 
return 
.end method 
.method public static main([Ljava/lang/String;)V 
.limit stack 3
.limit locals 2
ldc "http://rishe.co" 
invokestatic ir/ac/iust/scrawl/scrawlib/Helper/Get(Ljava/lang/String;)Lorg/jsoup/nodes/Document; 
astore_1
getstatic java/lang/System/out Ljava/io/PrintStream; 
aload_1
ldc "li"
invokevirtual org/jsoup/nodes/Document/select(Ljava/lang/String;)Lorg/jsoup/select/Elements; 
iconst_1
invokevirtual org/jsoup/select/Elements/get(I)Ljava/lang/Object;
checkcast org/jsoup/nodes/Element 
invokevirtual org/jsoup/nodes/Element/text()Ljava/lang/String; 
invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V 
return 
.end method 


