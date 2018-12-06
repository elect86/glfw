package hello

import org.glfw.*
import kotlin.system.*

fun main(args: Array<String>) {

    println("ciao")
    /* Initialize the library */
    if (glfwInit() == 0)
        return

    /* Create a windowed mode window and its OpenGL context */
    val window = glfwCreateWindow(640, 480, "Hello World", null, null)
    if (window == null) {
        glfwTerminate()
        return
    }

    var last = 0L
    var time = 0L
    var frames = 0

    /* Make the window's context current */
    glfwMakeContextCurrent(window)

    glClearColor(1f, 0.5f, 0f, 1f)

    glfwSwapInterval(0)

    for (i in 0..999)
        glfwWindowShouldClose(window)

    println(measureNanoTime {
        for (i in 0..9999)
            glfwWindowShouldClose(window)
    })

    /* Loop until the user closes the window */
    while (glfwWindowShouldClose(window) == 0) {
        /* Render here */
        glClear(GL_COLOR_BUFFER_BIT.toUInt())

        /* Swap front and back buffers */
        glfwSwapBuffers(window)

        /* Poll for and process events */
        glfwPollEvents()

        val now = getTimeMillis()
        time += now - last
        last = now
        frames++
        if (time > 1000) {
            time %= 1000
            glfwSetWindowTitle(window, "fps = $frames")
            frames = 0
        }
    }

    glfwTerminate()
    return
}
