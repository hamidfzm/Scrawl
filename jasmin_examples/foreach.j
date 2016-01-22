.class public Scrawlout 
.super java/lang/Object 
.method public <init>()V 
aload_0 
invokenonvirtual java/lang/Object/<init>()V 
return 
.end method 
.method public static main([Ljava/lang/String;)V 
ldc "http://rishe.co" 
invokestatic ir/ac/iust/scrawl/scrawlib/Helper/Get(Ljava/lang/String;)Lorg/jsoup/nodes/Document; 
astore_0 
aload_0
ldc "li"
invokevirtual org/jsoup/nodes/Document/select(Ljava/lang/String;)Lorg/jsoup/select/Elements; 
invokevirtual org/jsoup/select/Elements/iterator()Ljava/util/Iterator; 
astore_2
Lable1:
aload_2
invokeinterface java/util/Iterator/hasNext()Z 1
ifeq Lable2
aload_2
invokeinterface java/util/Iterator/next()Ljava/lang/Object; 1
checkcast org/jsoup/nodes/Element
astore_1
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "rishe" 
invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V 
goto Lable1
Lable2:
return 
.limit stack 2 
.limit locals 4
.end method 


