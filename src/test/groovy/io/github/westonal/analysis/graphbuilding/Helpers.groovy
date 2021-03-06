package io.github.westonal.analysis.graphbuilding

import io.github.westonal.analysis.PackageName
import io.github.westonal.analysis.graph.Edge

class Helpers {

    static def edge(PackageName from, PackageName to) {
        new Edge(from, to)
    }

    static PackageName p(String packageName) {
        new PackageName(packageName)
    }
}
