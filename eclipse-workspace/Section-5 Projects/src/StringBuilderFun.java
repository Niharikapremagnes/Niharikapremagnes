
public class StringBuilderFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder("John Baugh");
		System.out.println(sb);
		sb.append(" is awesome");
		System.out.println(sb);
		sb.insert(5, "Phillip ");
		System.out.println(sb);
		sb.replace(22, 29, "amazing");
		System.out.println(sb);
		sb.delete(4, 12);
		System.out.println(sb);
		sb.replace(0, 5, "Dr.");
		System.out.println(sb);
		
	}

}
