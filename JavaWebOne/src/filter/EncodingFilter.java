package filter;

import javax.servlet.*;
import java.io.IOException;

/**在filter下新建一个EncodingFilter用来解决中文字符集乱码，它需要实现Filter接口，并重写doFilter函数*/
public class EncodingFilter implements Filter {
    public EncodingFilter(){
        System.out.println("过滤器构造");
    }
    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, SecurityException, ServletException {
        /* 将编码修改为utf-8 */
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }
}

