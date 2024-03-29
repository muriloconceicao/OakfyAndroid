package muriloconceicao.oakfy.bases;

public interface BasePresenter <V extends BaseView> {
    void attachView(V view);
    void dettachView();
}