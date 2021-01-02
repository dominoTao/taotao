package icu.bibilailai.core;

import com.alibaba.fastjson.JSON;
import icu.bibilailai.core.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages = {"icu.bibilailai.core"})
@RestController
public class DetailStudyApplication {

	public static void main(String[] args) {

		SpringApplication.run(DetailStudyApplication.class, args);



		/*禁止重启*/
//		System.setProperty("spring.devtools.restart.enabled", "false");
		/*自定义横幅*/
//		SpringApplication.setBanner();
//		SpringApplication.run(DetailstudyApplication.class, args);


//		SpringApplication app = new SpringApplication(icu.bibilailai.core.DetailStudyApplication.class);
//		app.addListeners();
//		app.setBannerMode(Banner.Mode.OFF);
//		app.run(args);

//		需要构建ApplicationContext层次结构（具有父/子关系的多个上下文）或者您更喜欢使用“流畅”构建器API
		/*目前没有调用通*/
//		ConfigurableApplicationContext run = new SpringApplicationBuilder().listeners()
//				.sources(Parent.class)
//				.child(Application.class)
//				.bannerMode(Banner.Mode.OFF)
//				.run(args);
//		run.addApplicationListener(new ApplicationListener<ApplicationEvent>() {
//			@Override
//			public void onApplicationEvent(ApplicationEvent applicationEvent) {
//				System.out.println();
//			}
//		});

/*应用程序事件和监听器*/
//		某些事件实际上是在创建ApplicationContext之前触发的，因此您无法在@Bean上注册侦听器。
//		您可以使用SpringApplication.addListeners(…​)方法或SpringApplicationBuilder.listeners(…​)
//		方法注册它们。
//		如果您希望自动注册这些侦听器，无论应用程序的创建方式如何，您都可以将META-INF/spring.factories文件
//		添加到项目中并使用org.springframework.context.ApplicationListener键引用您的侦听器，
//		如下所示：以下示例：
//		org.springframework.context.ApplicationListener=com.example.project.MyListener


		/**
		 * 应用程序运行时，应按以下顺序发送应用程序事件：

		除了注册侦听器和初始化程序之外，在运行开始时但在任何处理之前发送ApplicationStartingEvent。
		当在上下文中使用的Environment已知但在创建上下文之前，将发送ApplicationEnvironmentPreparedEvent。
		在刷新开始之前但在加载bean定义之后发送ApplicationPreparedEvent。
		在刷新上下文之后但在调用任何应用程序和命令行运行程序之前发送ApplicationStartedEvent。
		在调用任何应用程序和命令行运行程序后发送ApplicationReadyEvent。它表示应用程序已准备好为请求提供服务。
		如果启动时发生异常，则会发送ApplicationFailedEvent。*/


		/**
		 * 为了区分分层、分代上下文中传入不同的事件，
		 *
		 * 可以通过实现ApplicationContextAware或者如果监听@Bean，可以通过注解@Autowired 来将事件注入上下文，进行比较
		 * */
//		ApplicationContextAware applicationContextAware = new ApplicationContextAware() {
//			@Override
//			public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//				return;
//			}
//		};


//		SpringApplication试图代表您创建正确类型的ApplicationContext。用于确定WebApplicationType的算法非常简单：
//
//		如果存在Spring MVC，则使用AnnotationConfigServletWebServerApplicationContext
//		如果Spring MVC不存在且存在Spring WebFlux，则使用AnnotationConfigReactiveWebServerApplicationContext
//		否则，使用AnnotationConfigApplicationContext
//		也可以通过调用setApplicationContextClass(…​)来完全控制使用的ApplicationContext类型。
//
//		SpringApplication springApplication = new SpringApplication();
//		springApplication.setWebApplicationType(WebApplicationType.SERVLET);
//		springApplication.setApplicationContextClass(new GenericXmlApplicationContext().getClass());




	}



	@PostMapping("/getname")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
		User user = new User();
//		System.out.println(user.getName());
//		System.out.println(user.getFullName());
		String s = JSON.toJSONString(user);

		return s;
	}

}
