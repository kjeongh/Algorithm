solution = lambda sizes: max(sum(sizes, [])) * max(min(size) for size in sizes)
