//桥接模式
public class BridgePattern {}

abstract class Image{
	protected ImageImp imp;//实现目标
	
	public void setImageImp(ImageImp imp){
		this.imp = imp;
	}
	
	public abstract void parseFile(String fileName);
}//抽象类，为固有维度

interface ImageImp{
	public void doPaint();
}//实现接口

class WindowsImp implements ImageImp{

	@Override
	public void doPaint() {
		// TODO Auto-generated method stub
		System.out.println("show windows pattern");
	}
}//具体的实现接口

class LinuxImp implements ImageImp{

	@Override
	public void doPaint() {
		// TODO Auto-generated method stub
		System.out.println("show linux pattern");
	}
}//具体的实现接口

class JPGImage extends Image{

	@Override
	public void parseFile(String fileName) {
		// TODO Auto-generated method stub
		imp.doPaint();
		System.out.println(fileName+" file type is: JPG");
	}
}//固有维度的实现

class BMPImage extends Image{

	@Override
	public void parseFile(String fileName) {
		// TODO Auto-generated method stub
		imp.doPaint();
		System.out.println(fileName+" file type is: BMP");

	}
}