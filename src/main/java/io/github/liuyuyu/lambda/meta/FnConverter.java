package io.github.liuyuyu.lambda.meta;

/**
 * @author liuyuyu
 */
public class FnConverter<T> {
    public String convertFnToString(Fn<T> fn){
        return Reflections.fnToFieldName(fn);
    }

    public static void main(String[] args) {
        FnConverter<Foo> fnConverter = new FnConverter<>();
        String fieldName = fnConverter.convertFnToString(Foo::getBar);
        System.out.println("方法名："+fieldName);
    }
}
