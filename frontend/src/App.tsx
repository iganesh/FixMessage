import { ThemeProvider, createTheme, CssBaseline, Container, AppBar, Toolbar, Typography, Box } from '@mui/material'

const theme = createTheme({
  palette: {
    primary: { main: '#1976d2' },
    secondary: { main: '#dc004e' },
  },
})

export default function App() {
  return (
    <ThemeProvider theme={theme}>
      <CssBaseline />
      <AppBar position="static">
        <Toolbar>
          <Typography variant="h6">FMC FIX Processor</Typography>
        </Toolbar>
      </AppBar>
      <Container maxWidth="lg" sx={{ mt: 4 }}>
        <Typography variant="h4">Welcome to FMC FIX Message Processor</Typography>
        <Typography variant="body1" sx={{ mt: 2 }}>
          A production-ready platform for processing FIX protocol messages
        </Typography>
      </Container>
    </ThemeProvider>
  )
}
