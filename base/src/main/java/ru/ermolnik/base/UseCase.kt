package ru.ermolnik.base

interface UseCase {
    interface ResourceUseCase<params : Params, T : Any> : UseCase {
        suspend fun executeAsync(params: params): Resource<T>
    }

    abstract class Params
}
