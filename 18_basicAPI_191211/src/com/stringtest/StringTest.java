package com.stringtest;

public class StringTest {

	public static void main(String[] args) {
		String name="������";
//		System.out.println("name�� hashCode() : "+name.hashCode());
//		int input1=name.hashCode();
//		
		String name2="����ȣ";
//		
//		//�Һ��� String
//		name="������";
//		System.out.println("name�� hashCode() : "+name.hashCode());
//		int input2=name.hashCode();
//		
//		boolean flag;
//		flag=input1==input2;
//		System.out.println("��������� ����? : "+flag);
//		
//		name+="������";
//		System.out.println("name�� hashCode() : "+name.hashCode());
//		int input3=name.hashCode();
//		flag=input2==input3;
//		System.out.println("��������� ����? : "+flag);
//		
//		StringBuffer namee=new StringBuffer("����");
//		System.out.println("namee�� hashCode() : "+namee.hashCode());
//		StringBuilder nameee=new StringBuilder("�����");
		
		//String�� ������ �޼���
		//1. ���ڿ��� ��ġ�� �޼��� : concat();
//		String sumName=name.concat(name2);
//		System.out.println(sumName);
		
		
		//2. ���ڿ��� �ִ� ���� ã�� : contains()
//		name="�����ٶ󸶹ٻ����";
//		System.out.println("\'��\'�� �ִ�? : "+name.contains("��"));
//		name="�, ����, ����, ����, ����";
//		System.out.println("����� \'����\'�� �ִ�? : "+name.contains("����"));
//		System.out.println("����� \'���\'�� �ִ�? : "+name.contains("���"));
		
		//3. replace() : �ش� ���ڿ��� *�ٲپ�*�ش�.
//		name="��⵵ ����� ���մ��";
//		name=name.replace(/*ã����*/"����",/*������ ��*/"����");
//		System.out.println(name);
		
		//4. substring() : ���ڿ��� �߶󳻴� ���
//		name="������ 19 ��⵵ �����";
//		System.out.println(name.substring(3));//������ ���ĸ��� �߶�
//		System.out.println(name.substring(3, 6)); //���� �κи��� �߶�
		
		//5. indexOf() : Ư�������� ��ġ�� ��Ÿ���ִ� ���
//		String file="D:\\workspace";
//		System.out.println(file.indexOf("\\"));
//		System.out.println(file.substring(file.indexOf("\\")+1));
//		String file="java.class.txt";
//		System.out.println(file.indexOf("."));
//		System.out.println(file.substring(file.indexOf(".")+1));
		
		//6. lastIndexOf() : �ڿ������� Ư�����ڿ� ��ġ �˷��ִ±��
//		System.out.println(file.substring(file.lastIndexOf(".")+1));
		
		//7. split()
//		name="������,����ȣ,���Ѹ�,�ڴ���,������,�̽¿�";
//		String[] names=name.split(",");
//		for(String n:names) {
//			System.out.println(n);
//		}
		
		
		//StringBuffer : ������ ��������� ����ϱ� ������
		//������ �����ϰ� ����, ������ ����
		System.out.println("====StringBufferClass====");
		System.out.println("String");
		String test="�����";
		System.out.println("test : "+test.hashCode());
		test+="�̹���";
		System.out.println(test);
		System.out.println("test�� : "+test.hashCode());
		
		//StringBuffer�� �޼��带 �̿��ؼ� ���ڿ��� ����
		System.out.println("\nStringBuffer");
		StringBuffer sb=new StringBuffer("�����");
		System.out.println(sb);
		System.out.println("sb : "+sb.hashCode());
		sb.append("�����");//�߰�
		System.out.println(sb);
		System.out.println("sb�� : "+sb.hashCode());
		
		sb.insert(3, "������ ȫȫ!");//����(index��ġ, ���Գ���)
		System.out.println(sb);
		System.out.println("sb���� : "+sb.hashCode());
		
		//String���� �޾Ƴ����� StringBuffer�� ��ȯ�� ����
		StringBuffer sb2=new StringBuffer(sb);
		sb.delete(3, 10);//����
		System.out.println(sb);
		
		//���������� StringBuffer�� ����� StringBuilder
		//StringBuilder�� threadsafety ����� ����.
		System.out.println("\nStringBuilder");
		StringBuilder sbb=new StringBuilder("����ȣ");
		sbb.append("�յ�");
		System.out.println(sbb);
		
		
	}
}
