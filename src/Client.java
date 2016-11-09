
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image;//固有属性图片
		ImageImp imp;//实现类
		image = (Image)XMLUtil.getBean("image");
		imp = (ImageImp)XMLUtil.getBean("os");
		image.setImageImp(imp);
		image.parseFile("bilibili");
	}
}
