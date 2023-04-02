class shape
{
	void draw()
	{
		System.out.println("can't say shape type");
	}
}
class square extends shape
{
	@Override
	void draw()
	{
		System.out.println("square shape");
	}
}
class methodOverriding
{
	public static void main(String[] args) {
		shape r = new square();
		r.draw();
	}
}