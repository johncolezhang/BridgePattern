//�Ž�ģʽ
public class BridgePattern {}

abstract class Image{
	protected ImageImp imp;//ʵ��Ŀ��
	
	public void setImageImp(ImageImp imp){
		this.imp = imp;
	}
	
	public abstract void parseFile(String fileName);
}//�����࣬Ϊ����ά��

interface ImageImp{
	public void doPaint();
}//ʵ�ֽӿ�

class WindowsImp implements ImageImp{

	@Override
	public void doPaint() {
		// TODO Auto-generated method stub
		System.out.println("show windows pattern");
	}
}//�����ʵ�ֽӿ�

class LinuxImp implements ImageImp{

	@Override
	public void doPaint() {
		// TODO Auto-generated method stub
		System.out.println("show linux pattern");
	}
}//�����ʵ�ֽӿ�

class JPGImage extends Image{

	@Override
	public void parseFile(String fileName) {
		// TODO Auto-generated method stub
		imp.doPaint();
		System.out.println(fileName+" file type is: JPG");
	}
}//����ά�ȵ�ʵ��

class BMPImage extends Image{

	@Override
	public void parseFile(String fileName) {
		// TODO Auto-generated method stub
		imp.doPaint();
		System.out.println(fileName+" file type is: BMP");

	}
}