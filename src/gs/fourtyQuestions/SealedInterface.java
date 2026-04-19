package gs.fourtyQuestions;

public sealed interface SealedInterface permits A, B {
}
final class A implements SealedInterface{}
final class B implements SealedInterface{}
