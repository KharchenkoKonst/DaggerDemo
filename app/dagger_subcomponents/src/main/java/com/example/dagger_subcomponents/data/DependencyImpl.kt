package com.example.dagger_subcomponents.data

import javax.inject.Inject

class DependencyImpl @Inject constructor(subDependency: SubDependency): Dependency {
}