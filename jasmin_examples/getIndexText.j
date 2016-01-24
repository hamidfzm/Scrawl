.class public Scrawlout 
.super java/lang/Object 
.method public <init>()V 
aload_0 
invokenonvirtual java/lang/Object/<init>()V 
return 
.end method 
.method public static main([Ljava/lang/String;)V 
ldc "http://teamfantasy.varzesh3.com/cns/if/players/player/?idd=2" 
invokestatic ir/ac/iust/scrawl/scrawlib/Helper/Get(Ljava/lang/String;)Lorg/jsoup/nodes/Document; 
astore_0 
getstatic java/lang/System/out Ljava/io/PrintStream; 
aload_0
ldc "#td2" 
invokevirtual org/jsoup/nodes/Document/select(Ljava/lang/String;)Lorg/jsoup/select/Elements; 
iconst_4
invokevirtual org/jsoup/select/Elements/get(I)Ljava/lang/Object;
checkcast org/jsoup/nodes/Element 
invokevirtual org/jsoup/nodes/Element/text()Ljava/lang/String; 
invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V 
.limit stack 20 
.limit locals 1 
return 
.end method 

