.class public SampleGet
.super java/lang/Object
	.method public <init>()V
		aload_0
		invokenonvirtual java/lang/Object/<init>()V
		return
	.end method
	.method public static main([Ljava/lang/String;)V
		.limit stack 2
		.limit locals 2

		ldc "http://rishe.co"
		invokestatic ir/ac/iust/scrawl/scrawlib/Helper.Get(Ljava/lang/String;)Lorg/jsoup/nodes/Document;
		astore_1
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload_1
		invokevirtual org/jsoup/nodes/Document.title()Ljava/lang/String;
		invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V
		return
	.end method
