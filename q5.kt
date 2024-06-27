fun(main)
{
	val a = 1001
	var b = a%10
	var a = a/10
	var c = a%10
	var a = a/10
	var d = a%10
	var a = a/10
	if((a!=0)&&((b==0)||(c==0)||(d==0)))
	{
		println("Duck number\n")
	}
	else
	{
		println("Not a duck number\n")
	}
}
