package com.duonghb.testbitrise.domain.usecase

import com.duonghb.testbitrise.data.repository.NewsRepositoryImpl
import com.duonghb.testbitrise.domain.model.NewsModel
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetNewsListUseCase @Inject constructor(
    private val newsRepositoryImpl: NewsRepositoryImpl
) {
    operator fun invoke(): Single<NewsModel> {
        return newsRepositoryImpl.getNewsList()
    }
}
