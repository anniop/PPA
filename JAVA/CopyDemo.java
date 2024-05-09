class Student implements Cloneable
{
    public String Name;
    public int Marks;
    public int Age;

    public Student (String str, int A, int B)
    {
        this.Name = str;
        this.Marks = A;
        this.Age = B;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class CopyDemo
{
    public static void main(String Google[])
    {
        try
        {
            Student sobj = new Student("Aniket", 90, 21);
            System.out.println("Name of Student "+ sobj.Name);
            System.out.println("Marks Obtained by the student "+ sobj.Marks);
            System.out.println("Age of student "+ sobj.Age);
            
            Student sobjx = (Student)sobj.clone();
            System.out.println("Name of Student "+ sobjx.Name);
            System.out.println("Marks Obtained by the student "+ sobjx.Marks);
            System.out.println("Age of student "+ sobjx.Age);
        }
        catch(Exception obj)
        {

        }
    }
}